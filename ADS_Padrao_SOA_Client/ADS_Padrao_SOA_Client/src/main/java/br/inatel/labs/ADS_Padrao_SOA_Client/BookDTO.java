package br.inatel.labs.ADS_Padrao_SOA_Client;

public class BookDTO {
	
	private Long id;
	
	private String title;
	
	private String category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "BookDTO [id=" + id + ", title=" + title + ", category=" + category + "]";
	}

}
