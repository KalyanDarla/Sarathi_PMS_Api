package com.sarathi.support.service;

import com.sarathi.support.dto.NewsDTO;
import com.sarathi.support.entity.News;
import com.sarathi.support.repository.NewsRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NewsService {

    private final NewsRepository repository;

     
    public NewsService(NewsRepository repository) {
        this.repository = repository;
    }

    public List<NewsDTO> getAllNews() {
        return repository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<NewsDTO> getNewsById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    public NewsDTO saveNews(NewsDTO dto) {
        News news = convertToEntity(dto);
        news.setCreatedOn(Instant.now());
        News savedNews = repository.save(news);
        return convertToDTO(savedNews);
    }

    public NewsDTO updateNews(Integer id, NewsDTO dto) {
        Optional<News> existingNewsOpt = repository.findById(id);
        if (existingNewsOpt.isPresent()) {
            News existingNews = existingNewsOpt.get();
            existingNews.setProjectId(dto.getProjectId());
            existingNews.setTitle(dto.getTitle());
            existingNews.setSummary(dto.getSummary());
            existingNews.setDescription(dto.getDescription());
            existingNews.setAuthorId(dto.getAuthorId());
            existingNews.setCommentsCount(dto.getCommentsCount());
            existingNews.setCreatedOn(Instant.now());

            News updatedNews = repository.save(existingNews);
            return convertToDTO(updatedNews);
        } else {
            throw new RuntimeException("News with ID " + id + " not found.");
        }
    }

    public void deleteNews(Integer id) {
        repository.deleteById(id);
    }

    private NewsDTO convertToDTO(News news) {
        return new NewsDTO(
                news.getId(),
                news.getProjectId(),
                news.getTitle(),
                news.getSummary(),
                news.getDescription(),
                news.getAuthorId(),
                news.getCreatedOn(),
                news.getCommentsCount()
        );
    }

    private News convertToEntity(NewsDTO dto) {
        News news = new News();
        news.setId(dto.getId());
        news.setProjectId(dto.getProjectId());
        news.setTitle(dto.getTitle());
        news.setSummary(dto.getSummary());
        news.setDescription(dto.getDescription());
        news.setAuthorId(dto.getAuthorId());
        news.setCreatedOn(dto.getCreatedOn());
        news.setCommentsCount(dto.getCommentsCount());
        return news;
    }
}

