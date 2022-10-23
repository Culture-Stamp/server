package com.culturestamp.back.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private Long categoryId;

	@Column(name = "category_name")
	private String categoryName;

	@Column(name = "review_count")
	private String reviewCount;

	// @ManyToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name="user_id")
	// private User user;

	public Category() {

	}

	public Category(Long categoryId, String categoryName, String reviewCount) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.reviewCount = reviewCount;
	}

	public Category( String categoryName, String reviewCount) {
		this.categoryName = categoryName;
		this.reviewCount = reviewCount;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(String reviewCount) {
		this.reviewCount = reviewCount;
	}
}