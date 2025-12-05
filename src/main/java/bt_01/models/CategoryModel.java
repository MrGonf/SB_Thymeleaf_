package bt_01.models;

import java.io.Serializable;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryModel implements Serializable{

	private static final long serialVersionUID = 1L;

    private Long id;
    @NotEmpty(message = "Không được bỏ trống")
    private String name;
    private String images;
    private int status;
    
    private Boolean isEdit=false;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getIsEdit() {
		return isEdit;
	}

	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}
    
    
}
