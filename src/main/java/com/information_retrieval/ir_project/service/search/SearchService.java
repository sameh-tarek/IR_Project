package com.information_retrieval.ir_project.service.search;

public interface SearchService {
    public String search(String indexType, String searchText, boolean normalization, boolean steaming, boolean lemetization);
}
