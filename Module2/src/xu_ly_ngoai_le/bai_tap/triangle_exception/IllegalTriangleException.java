package xu_ly_ngoai_le.bai_tap.triangle_exception;

public class IllegalTriangleException extends Exception{
	
	 String thongBao;

	    public IllegalTriangleException(String baoLoi){
	        thongBao = baoLoi;
	    }

	    public String getThongBao(){
	        return thongBao;
	    }
}

