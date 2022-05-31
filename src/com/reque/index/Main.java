package com.reque.index;

import java.io.IOException;
import org.apache.lucene.document.Document;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;

public class Main {
    String indexDir = "C:\\Lucene\\Index";
    String dataDir = "C:\\Lucene\\Data";
    Indexer indexer;
    Searcher searcher;

    private void createIndex() throws IOException {
        indexer = new Indexer(indexDir);
        int numIndexed;
        long startTime = System.currentTimeMillis();
        // Aca el filtro de archivos viene definido de Text
        numIndexed = indexer.createIndex(dataDir, new TextFileFilter());
        long endTime = System.currentTimeMillis();
        indexer.close();
        System.out.println(numIndexed+" File indexed, time taken : " + (endTime-startTime)+" ms");
    }

    private void search(String searchQuery) throws IOException, ParseException {
        searcher = new Searcher(indexDir);
        long startTime = System.currentTimeMillis();
        TopDocs hits = searcher.search(searchQuery);
        long endTime = System.currentTimeMillis();
        System.out.println(hits.totalHits + " documents found. Time :" + (endTime - startTime));
        for (ScoreDoc scoreDoc : hits.scoreDocs){
            Document doc = searcher.getDocument(scoreDoc);
            System.out.println("File : " + doc.get("filepath"));
        }
        searcher.close();
    }

    public static void main(String[] args) {
        Main main;
        try {
            main = new Main();
            main.createIndex();
            main.search("Sahil");
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
