package com.yunkuo.cms.entity.assist.base;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cms_sensitivity database table.
 * 
 */
/*@Entity
@Table(name="cms_sensitivity")*/
@MappedSuperclass
public class BaseCmsSensitivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sensitivity_id")
	private int id;

	private String replacement;

	private String search;

    // constructors
    public BaseCmsSensitivity () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsSensitivity (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsSensitivity (
            java.lang.Integer id,
            java.lang.String search,
            java.lang.String replacement) {

        this.setId(id);
        this.setSearch(search);
        this.setReplacement(replacement);
        initialize();
    }

    protected void initialize () {}

	public int getId() {
		return this.id;
	}

	public void setId(int sensitivityId) {
		this.id = sensitivityId;
	}

	public String getReplacement() {
		return this.replacement;
	}

	public void setReplacement(String replacement) {
		this.replacement = replacement;
	}

	public String getSearch() {
		return this.search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

}