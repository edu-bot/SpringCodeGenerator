package com.radicalz.persistence.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employee_project database table.
 * 
 */
@Entity
@Table(name="employee_project")
@NamedQuery(name="EmployeeProject.findAll", query="SELECT e FROM EmployeeProject e")
public class EmployeeProject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private Integer id;

	@Column(nullable=false)
	private Byte type;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employee_id", nullable=false)
	private Employee employee;

	//bi-directional many-to-one association to Project
	@ManyToOne
	@JoinColumn(name="project_id", nullable=false)
	private Project project;

	public EmployeeProject() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Byte getType() {
		return this.type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
