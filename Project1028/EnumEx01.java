//¿­°ÅÇü
public enum EnumEx01 {
	    GET,
	    HEAD,
	    POST,
	    PUT,
	    DELETE,
	    CONNECT,
	    OPTIONS,
	    TRACE,
	    PATCH;
			
	public static void main(String[] args) {
		System.out.println(EnumEx01.CONNECT.name());
		System.out.println(EnumEx01.CONNECT.ordinal());
	}

}
