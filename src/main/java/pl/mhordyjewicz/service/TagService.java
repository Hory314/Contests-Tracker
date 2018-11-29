package pl.mhordyjewicz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.mhordyjewicz.entity.Category;
import pl.mhordyjewicz.entity.Tag;
import pl.mhordyjewicz.repository.TagRepository;

import java.util.List;

@Service
@Transactional
public class TagService
{
    @Autowired
    TagRepository tagRepository;

    public List<Tag> getAllTags()
    {
        return tagRepository.findAll();
    }
}
