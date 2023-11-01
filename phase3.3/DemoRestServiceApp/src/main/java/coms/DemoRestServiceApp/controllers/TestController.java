package coms.DemoRestServiceApp.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/std")
	public List<String>  StudentNames()
	{
		List<String>  strLst = new ArrayList<String>();
		
		strLst.add("Murali");
		strLst.add("Mohan");
		strLst.add("Maharaj");
		strLst.add("Mrunalini");
		strLst.add("Mahesh");
		
		return strLst;
	}

	@GetMapping("/stdinfo")
	public Map<String, Integer>  StudentInfo()
	{
		Map<String, Integer>  stddata = new HashMap<String, Integer>();
		stddata.put("Ravi", 1001);
		stddata.put("Kavi", 1002);
		stddata.put("Lavi", 1003);
		stddata.put("Bavi", 1004);
		return stddata;
	}

}
