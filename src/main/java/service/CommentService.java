package service;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repository.ICommentRepository;

public class CommentService implements ICommentService{
    @Autowired
    private ICommentRepository commentRepository;

    @Override
    public Page<Comment> findAll(Pageable pageable) {
        return commentRepository.findAll(pageable);
    }

    @Override
    public Comment findById(Long id) {
        return commentRepository.findOne(id);
    }

    @Override
    public void save(Comment comment) {
        commentRepository.save(comment);
    }
}
