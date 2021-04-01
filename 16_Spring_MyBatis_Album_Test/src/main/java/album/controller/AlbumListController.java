package album.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import album.model.AlbumBean;
import album.model.AlbumDao;

@Controller
public class AlbumListController {

	private final String command = "/list.ab"; // final 사용 이유: 
	private final String getPage = "albumList"; // /WEB-INF/album/albumList.jsp 
	
	@Autowired
	private AlbumDao albumDao; 
	
	@RequestMapping(value=command)
	public ModelAndView doAction() {
		
//		dao객체
//		ArrayList = dao.list();
		
		List<AlbumBean> lists = albumDao.getAlbumList();
		ModelAndView mav = new ModelAndView();
		mav.addObject("albumLists", lists);
		mav.setViewName(getPage);
		return mav;
	}
}
