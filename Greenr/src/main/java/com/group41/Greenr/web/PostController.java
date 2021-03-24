package com.group41.Greenr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;
import com.group41.Greenr.model.Post;
import com.group41.Greenr.service.PostService;
import com.group41.Greenr.web.dto.PostRepository;


@Controller
public class PostController {
    @Autowired
    private PostService postService;
    private String searchField;
    @GetMapping("/listPosts.html")
    public String showPosts(Model model) {

            List<Post> posts = postService.getAllPosts();
            model.addAttribute("posts", posts);
        return "/listPosts.html";
    }

    @GetMapping("/newPost.html")
    public String showNewPost() {
        return "/newPost.html";
    }
    
    @GetMapping("/searchResults.html")
    public String showResults(Model model) 
    {
    	List<Post> list = postService.findAll(searchField);
        model.addAttribute("posts", list);
        return "searchResults.html";
    }
    
    @GetMapping("/search")
    public String findAll(@RequestParam("search") String PostName, Model model)
    {
    	searchField = PostName;
//    	System.out.println(PostName);
    	List<Post> list = postService.findAll(PostName);
        model.addAttribute("posts", list);
//    	for(Post el:list)
//    	{
//    		System.out.println(el.getPostName());
//    	}
    	return "redirect:/searchResults.html";
    }

    
    @PostMapping("/addPost")
    public String savePost(@RequestParam("file") MultipartFile file, @RequestParam("p_title") String PostName,
            @RequestParam("p_desc") String PostDesc) 
    {
        postService.savePostToDB(file, PostName, PostDesc);
        return "redirect:/listPosts.html";
    }

    @GetMapping("/deletePost/{id}")
    public String deletePost(@PathVariable("id") Long id) {
        postService.deletePostById(id);
        return "redirect:/listPosts.html";
    }

    @PostMapping("/editTitle")
    public String editTitle(@RequestParam("id") Long id, @RequestParam("newPostTitle") String name) {
        postService.editTitle(id, name);
        return "redirect:/listPosts.html";
    }

    @PostMapping("/editDescription")
    public String editDescription(@RequestParam("id") Long id, @RequestParam("newPostDesc") String description) {
        postService.editDescription(id, description);
        return "redirect:/listPosts.html";
    }
}
