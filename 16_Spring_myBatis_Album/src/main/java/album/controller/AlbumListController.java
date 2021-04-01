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
	
	private final String command = "/list.ab"; //final The value for annotation attribute RequestMapping ������ ������ �ʴ� ���� �Է��ؾ���
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
		ModelAndView mav = new ModelAndView(); //modelandview �� ������ �̵�
		mav.addObject("albumLists", lists); //�̵� �� ��ü
		mav.setViewName(getPage); //�̵� �� ���
		return mav;
	}
}