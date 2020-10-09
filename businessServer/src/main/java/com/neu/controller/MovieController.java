package com.neu.controller;

import com.neu.dto.PageDto;
import com.neu.dto.ResponseDto;
import com.neu.model.Movie;
import com.neu.model.Rating;
import com.neu.model.Tag;
import com.neu.model.User;
import com.neu.service.MovieService;
import com.neu.service.RatingService;
import com.neu.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/MovieController")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private TagService tagService;

    @Autowired
    private RatingService ratingService;

    @PostMapping("/listAll")
    public ResponseDto listAll(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        movieService.listAll(pageDto);
        if(pageDto.getTotal()==0){
            responseDto.setSuccess(false);
        }
        responseDto.setContent(pageDto);
        return responseDto;
    }

    @PostMapping("/getDetail")
    public ResponseDto getDetail(@RequestBody Map<String,Integer> mp){
        ResponseDto responseDto = new ResponseDto();
        Rating rating=ratingService.find(mp);
        List<Tag> tags=tagService.find(mp);
        Map<String,Object> details=new HashMap<>();
        if(rating!=null){
            details.put("score",rating.getScore());
            details.put("ratingTime",rating.getTimestamp());
        }
        if(tags.size()>0){
            details.put("tagList",tags);
        }
        responseDto.setContent(details);
        return responseDto;
    }
    @PostMapping("/search")
    public ResponseDto search(@RequestBody Map<String, Object> mp){
        ResponseDto responseDto = new ResponseDto();
        List<Movie> movieList=movieService.search(mp);
        if(movieList.size()==0){
            responseDto.setSuccess(false);
        }
        responseDto.setContent(movieList);
        return responseDto;
    }

    @PostMapping("/getOne")
    public ResponseDto getOne(@RequestBody Movie movie){
        ResponseDto responseDto=new ResponseDto();
        movie=movieService.getOne(movie);
        responseDto.setContent(movie);
        return responseDto;
    }

    @PostMapping("/getCount")
    public ResponseDto getCount(@RequestBody Movie movie){
        ResponseDto responseDto=new ResponseDto();
        int c=movieService.getCount(movie);
        responseDto.setContent(c);
        return responseDto;
    }
    @PostMapping("/currCount")
    public ResponseDto currCount(@RequestBody PageDto pageDto){
        ResponseDto responseDto=new ResponseDto();
        List<Map<String,Object>> mvList=movieService.currCount(pageDto);
        if(mvList.size()==0){
            responseDto.setSuccess(false);
        }
        responseDto.setContent(mvList);
        return responseDto;
    }
    @PostMapping("/getAvg")
    public ResponseDto getAvg(@RequestBody Movie movie){
        ResponseDto responseDto=new ResponseDto();
        double avg=movieService.getAvg(movie);
        responseDto.setContent(avg);
        return responseDto;
    }
    @PostMapping("/top10")
    public ResponseDto top10(@RequestBody Map<String, Object> mp){
        ResponseDto responseDto=new ResponseDto();
        List<Map<String,Object>> mvList=movieService.top10(mp.get("genre").toString());
        if(mvList.size()==0){
            responseDto.setSuccess(false);
        }
        responseDto.setContent(mvList);
        return responseDto;
    }
    @PostMapping("/top10_hc")
    public ResponseDto top10_history_count(@RequestBody PageDto pageDto){
        ResponseDto responseDto=new ResponseDto();
        List<Map<String,Object>> mvList=movieService.top10_history_count(pageDto);
        if(mvList.size()==0){
            responseDto.setSuccess(false);
        }
        responseDto.setContent(mvList);
        return responseDto;
    }
    @PostMapping("/top10_cc")
    public ResponseDto top10_current_count(@RequestBody PageDto pageDto){
        ResponseDto responseDto = new ResponseDto();
        List<Map<String,Object>> mvList=movieService.top10_current_count(pageDto);
        if(mvList.size()==0){
            responseDto.setSuccess(false);
        }
        responseDto.setContent(mvList);
        return responseDto;
    }
    @PostMapping("/top10_r")
    public ResponseDto top10_rate(@RequestBody PageDto pageDto){
        ResponseDto responseDto=new ResponseDto();
        List<Map<String,Object>> mvList=movieService.top10_rate(pageDto);
        if(mvList.size()==0){
            responseDto.setSuccess(false);
        }
        responseDto.setContent(mvList);
        return responseDto;
    }
    @PostMapping("/userRecommend")
    public ResponseDto userRecommend(@RequestBody User user){
        ResponseDto responseDto=new ResponseDto();
        List<Map<String,Object>> mvList=movieService.userRecommend(user);
        if(mvList.size()==0){
            responseDto.setSuccess(false);
        }
        responseDto.setContent(mvList);
        return responseDto;
    }
    @PostMapping("/contRecommend")
    public ResponseDto contRecommend(@RequestBody User user){
        ResponseDto responseDto=new ResponseDto();
        List<Map<String,Object>> mvList=movieService.contRecommend(user);
        if(mvList.size()==0){
            responseDto.setSuccess(false);
        }
        responseDto.setContent(mvList);
        return responseDto;
    }
}
