package album.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import album.model.AlbumBean;
import album.model.AlbumDao;

@Controller
public class AlbumListController {
	
	private final String command = "/list.ab"; //final The value for annotation attribute RequestMapping 오류는 변하지 않는 값을 입력해야함
	private final String getPage = "albumList";
	
	@Autowired
	private AlbumDao albumDao;
	
	@RequestMapping(value = command)
	public ModelAndView doAction() {
		
		//ArrayList<AlbumBean> list = dao.list();
		List<AlbumBean> lists = albumDao.getAlbumList();
		/*System.out.println("controller----");
		System.out.println(lists.size());
		for(AlbumBean bean : lists) {
			System.out.println(bean.getTitle());
		}*/
		//github-commit Test
		ModelAndView mav = new ModelAndView(); //modelandview 로 데이터 이동
		mav.addObject("albumLists", lists); //이동 할 객체
		mav.setViewName(getPage); //이동 할 장소
		return mav;
	}
}
