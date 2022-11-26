package com.codegym.service;

import com.codegym.model.Blog;
import com.codegym.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;
    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Object findById(Integer id) {
        return blogRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
blogRepository.delete((Blog) findById(id));
    }

    @Override
    public void save(Blog blog) {
blogRepository.save(blog);
    }
}
