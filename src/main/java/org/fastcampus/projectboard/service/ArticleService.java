package org.fastcampus.projectboard.service;

import lombok.RequiredArgsConstructor;
import org.fastcampus.projectboard.domain.type.SearchType;
import org.fastcampus.projectboard.dto.ArticleDto;
import org.fastcampus.projectboard.dto.ArticleWithCommentsDto;
import org.fastcampus.projectboard.repository.ArticleRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor // 필수 필드에 대한 생성자를 자동으로 생성
@Transactional // DB 작업시 작업 하나라도 실패하면 전부 취소(rollback), 성공하면 전부 반영(commit)
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public Page<ArticleDto> searchArticles(SearchType searchType, String searchKeyword, Pageable pageable) {
        return Page.empty();
    }

    @Transactional(readOnly = true)
    public ArticleWithCommentsDto getArticle(Long articleId) {
        return null;
    }

    public void saveArticle(ArticleDto dto) {

    }

    public void updateArticle(ArticleDto dto) {
    }

    public void deleteArticle(long articleId) {

    }
}
