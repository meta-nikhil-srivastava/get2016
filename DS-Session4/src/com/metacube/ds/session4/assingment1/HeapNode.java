package com.metacube.ds.session4.assingment1;

/**
 * Heap Node data type for creating Heap
 * 
 * @author Nikhil
 *
 * @param <E>
 *            TO define data type at the time of execution
 */
public class HeapNode<E> {

	private int jobPriority; // To store the job Priority
	private E jobData; // To store the job data

	public HeapNode() {

	}

	/**
	 * Parameterized constructor for initializing the values
	 * 
	 * @param jobPriority
	 *            - priority of the job
	 * @param jobData
	 *            - Data of the job to be performed
	 */
	public HeapNode(int jobPriority, E jobData) {
		this.jobPriority = jobPriority;
		this.jobData = jobData;
	}

	/**
	 * @return the jobPriority
	 */
	public int getJobPriority() {
		return jobPriority;
	}

	/**
	 * @param jobPriority
	 *            the jobPriority to set
	 */
	public void setJobPriority(int jobPriority) {
		this.jobPriority = jobPriority;
	}

	/**
	 * @return the department
	 */
	public E getJobData() {
		return jobData;
	}

	/**
	 * @param department
	 *            the department to set
	 */
	public void setJobData(E jobType) {
		this.jobData = jobType;
	}
}
