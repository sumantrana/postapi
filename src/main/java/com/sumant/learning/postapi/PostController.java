package com.sumant.learning.postapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
public class PostController {

    private Map<Integer, Post> postMap = Map.of(1, new Post(1,
            1,
            "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
            "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"),
            2, new Post(1,
                    2,
                    "qui est esse",
                    "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla"));


    @GetMapping("/posts")
    public Collection<Post> getAllPosts(){
        return postMap.values();
    }

    @GetMapping("/post/{id}")
    public Post getPostForId(@PathVariable int id){
        return postMap.get(id);
    }
}


