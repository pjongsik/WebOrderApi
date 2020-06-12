<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="EUC-KR" %>
			<div><a href="/help/hm2e/welcome.jsp"><img src="/help/hm2e/img/help_logo.gif" alt="얼마에요2E도움말" /></a></div>

            <div class="Category">
                <ul>
                    <li><a href="/help/hm2e/user01.jsp">기초관리</a></li>
                    <li><a href="/help/hm2e/mtrade1.jsp">회계관리</a></li>
                    <li><a href="/help/hm2e/rpt01.jsp">재무보고</a></li>
                    <li><a href="/help/hm2e/rpt31.jsp">회계보고</a></li>
                    <!--li><a href="/help/hm2e/fnzmain.jsp">결산/재무제표</a></li-->
                    <li><a href="/help/hm2e/logz01.jsp">재고물류</a></li>
                    <li><a href="/help/hm2e/rpt02.jsp">물류보고</a></li>
                    <li><a href="/help/hm2e/tax_trans.jsp">세금과거래</a></li>
					<li><a href="/help/hm2e/business01.jsp">영업관리</a></li>
                    <li><a href="/help/hm2e/cli01.jsp">고객관리</a></li>
                    <li><a href="/help/hm2e/pay01.jsp">인사급여</a></li>
                        <ol>
                            <li><a href="/help/hm2e/pay01.jsp">사원관리</a></li>
                            <li><a href="/help/hm2e/pay02.jsp">사원추가, 부서관리</a></li>
                            <li><a href="/help/hm2e/pay16.jsp">사원관리 인쇄메뉴</a></li>
                            <li><a href="/help/hm2e/pay05.jsp">급여관리 대장</a></li>
                            <li><a href="/help/hm2e/pay06.jsp">급여내역 추가</a></li>
                            <li><a href="/help/hm2e/pay13.jsp">급여관리 인쇄메뉴</a></li>
                            <li><a href="/help/hm2e/pay09.jsp">개인별 연간 급여 지급내역</a></li>
                            <li><a href="/help/hm2e/pay10.jsp">부서별 연간 급여 지급내역</a></li>
                            <li><a href="/help/hm2e/pay18.jsp">사원 대출금 관리</a></li>
							<li><a href="/help/hm2e/pay19.jsp">현장/폴더별 급여관리</a></li>
							<li><a href="/help/hm2e/pay20.jsp">퇴직소득 관리대장</a></li>
							<li><a href="/help/hm2e/pay12.jsp">인사급여 비밀번호</a></li>
                            <li><a href="/help/hm2e/pay11.jsp">인사급여 환경설정</a></li>
                        </ol>
                    <li><a href="/help/hm2e/argus01.jsp">고정자산</a></li>
                    <li><a href="/help/hm2e/other03.jsp">도움말</a></li>
                </ul>
            </div>
<script>
window.onload = function() {
	var url = window.location.href;
	alert(url);

	var title = document.getElementsByClassName("tit")[0].innerText;
	alert(title);
	
	var xhr = new XMLHttpRequest();
	xhr.open("GET", "http://192.168.1.43:8080/user/orderCompanyId/1");
	xhr.send();
}

	

</script>