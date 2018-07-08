package lulu.gelgel.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SampleController {

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/detail")
	public ModelAndView detail() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("detail");
		return mv;
	}
}
