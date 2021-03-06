package album.model;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//AlbumDao myAlbumDao = new AlbumDao();
@Component("myAlbumDao")
public class AlbumDao {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate ; //~root-context.xml
	
	public AlbumDao() {
		System.out.println("AlbumDao()");
		
		
	}

	public List<AlbumBean> getAlbumList() {
		
		List<AlbumBean> lists = new ArrayList<AlbumBean>();
		lists = sqlSessionTemplate.selectList("album.AlbumBean.GetAlbumList"); //mapper-namespace ???? ID
		System.out.println("list Size Test-------");
		System.out.println(lists.size());
		return lists;
	}
}
