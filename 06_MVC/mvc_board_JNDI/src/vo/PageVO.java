package vo;
//페이징처리를 위한 변수를 지정하는 vo
public class PageVO {
	private int currentPage; //현재페이지
	private int totalCount; //전체 게시물 수
	private int CountPerPage; //한 페이지당 게시물 건수 
	
	private int totalPage; //전체 페이지 수
	private int startNo; // 한 페이지 에서 보여줄 게시글의 시작번호
	private int endNo; // 한 페이지 에서 보여줄 게시글의 끝번호
	private int startPage; // 시작 페이지 번호
	private int endPage; // 끝 페이지 번호
	
	private boolean isPre;//이전페이제 존재 여부
	private boolean isNext; // 다음 페이지 존재 여부
	
	public PageVO(){
		
	}

	public PageVO(int currentPage, int totalCount, int countPerPage) {//현재 페이지와 총 몇건의 데이터가있는지, 
																//한 페이지당 몇건의 데이터를 넣는지 확인하는 생성자
		
		//currentPage = 1  totalCount=102   countPerPage = 10 이면
		// 총페이지수 11개
		super();
		this.currentPage = currentPage;
		this.totalCount = totalCount;
		this.CountPerPage = countPerPage;
		//전체 페이지 수?
		//총 게시물 수 / 한페이지당 게시물 수 = 전체 페이지
		totalPage = (totalCount%countPerPage == 0)?
				totalCount/countPerPage : totalCount/countPerPage+1;
			//총 데이터 수에서 한 페이지당 게시물수 나눈 값이 0 이면 총 페이지에서 한페이지당 게시물수를 나눈 페이지 ex) 100 /10 = 페이지수10
			//그렇지 않고 나머지값이 있으면 총페이지 에서 +1  102/10 = 페이지수 11
		if(totalPage == 0 ) totalPage = 1;
		
		//현재 페이지의 시작 번호와 끝번호를 구하고싶습니당
		//currentPage = 1 라면 시작번호 1 끝번호 10
		//currentPage = 2 라면 시작번호 11 끝번호 20
		
		//멤버변수
		startNo = (currentPage-1)*countPerPage+1; //시작번호는 현재 페이지 -1에서 카운터당 페이지 에서 +1한 수
		
		endNo = currentPage*countPerPage; // 끝번호는 현재 페이지에서 페이지당 게시물수를 곱한 수
		
		//시작 페이지 번호 끝 페이지 번호
		
		//한 화면에 페이지 몇개? 현재 페이지 기준으로 밑으로 5 중앙 5
		//현재 페이지가 7이면 2~12 페이지까지
		startPage = currentPage - 5;
		endPage =  currentPage +5;
		if(startPage <= 0 ){//시작페이지가 0보다 작으면 1로 고정 1부터 시작
			startPage = 1; 
			endPage = 11;
		}
		if(endPage >= totalPage){  //끝 페이지가 총 페이지보다 크면 끝페이지는 총페이지 수만큼
			endPage = totalPage;
			startPage = endPage - 10;
		}
		//이전 다음 메뉴 활성화 여부 판단
		if(startPage >= 2 ) isPre = true; //시작 페이지가 2보다 크면 이전 나옴
		if(endPage <= totalPage) isNext = true;  //끝 페이지가 총 페이지보다 작으면 다음 나옴
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getCountPerPage() {
		return CountPerPage;
	}

	public void setCountPerPage(int countPerPage) {
		CountPerPage = countPerPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getStartNo() {
		return startNo;
	}

	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}

	public int getEndNo() {
		return endNo;
	}

	public void setEndNo(int endNo) {
		this.endNo = endNo;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPre() {
		return isPre;
	}

	public void setPre(boolean isPre) {
		this.isPre = isPre;
	}

	public boolean isNext() {
		return isNext;
	}

	public void setNext(boolean isNext) {
		this.isNext = isNext;
	}
	
	

}
