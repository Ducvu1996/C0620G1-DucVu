package huong_doi_tuong.bai_tap;



public class StopWatch {
	private long startTime;
	private long endTime;
	StopWatch(){
	
	}
	//start time
	public long getStartTime(){
		return startTime;
	}

	public void setStartTime(long startTime) {
	      this.startTime = startTime;
	}
	// end time
	public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    
    void start() {
		startTime= System.currentTimeMillis();
		
	} 
	void end() {
		endTime= System.currentTimeMillis();
	}
	long getElapsedTime() {
		return endTime-startTime;
	}
}
