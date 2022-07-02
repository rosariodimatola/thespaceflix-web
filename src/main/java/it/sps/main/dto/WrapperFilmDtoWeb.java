package it.sps.main.dto;

import java.util.ArrayList;
import java.util.List;

public class WrapperFilmDtoWeb {
	
	private ArrayList<FilmDtoWeb> list;

	public WrapperFilmDtoWeb() {}
	
	public WrapperFilmDtoWeb(ArrayList<FilmDtoWeb> list) {
		this.list = list;
	}

	public ArrayList<FilmDtoWeb> getList() {
		return list;
	}

	public void setList(ArrayList<FilmDtoWeb> list) {
		this.list = list;
	}
	
}
