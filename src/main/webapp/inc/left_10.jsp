<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="EUC-KR" %>
			<div><a href="/help/hm2e/welcome.jsp"><img src="/help/hm2e/img/help_logo.gif" alt="�󸶿���2E����" /></a></div>

            <div class="Category">
                <ul>
                    <li><a href="/help/hm2e/user01.jsp">���ʰ���</a></li>
                    <li><a href="/help/hm2e/mtrade1.jsp">ȸ�����</a></li>
                    <li><a href="/help/hm2e/rpt01.jsp">�繫����</a></li>
                    <li><a href="/help/hm2e/rpt31.jsp">ȸ�躸��</a></li>
                    <!--li><a href="/help/hm2e/fnzmain.jsp">���/�繫��ǥ</a></li-->
                    <li><a href="/help/hm2e/logz01.jsp">�����</a></li>
                    <li><a href="/help/hm2e/rpt02.jsp">��������</a></li>
                    <li><a href="/help/hm2e/tax_trans.jsp">���ݰ��ŷ�</a></li>
					<li><a href="/help/hm2e/business01.jsp">��������</a></li>
                    <li><a href="/help/hm2e/cli01.jsp">������</a></li>
                    <li><a href="/help/hm2e/pay01.jsp">�λ�޿�</a></li>
                        <ol>
                            <li><a href="/help/hm2e/pay01.jsp">�������</a></li>
                            <li><a href="/help/hm2e/pay02.jsp">����߰�, �μ�����</a></li>
                            <li><a href="/help/hm2e/pay16.jsp">������� �μ�޴�</a></li>
                            <li><a href="/help/hm2e/pay05.jsp">�޿����� ����</a></li>
                            <li><a href="/help/hm2e/pay06.jsp">�޿����� �߰�</a></li>
                            <li><a href="/help/hm2e/pay13.jsp">�޿����� �μ�޴�</a></li>
                            <li><a href="/help/hm2e/pay09.jsp">���κ� ���� �޿� ���޳���</a></li>
                            <li><a href="/help/hm2e/pay10.jsp">�μ��� ���� �޿� ���޳���</a></li>
                            <li><a href="/help/hm2e/pay18.jsp">��� ����� ����</a></li>
							<li><a href="/help/hm2e/pay19.jsp">����/������ �޿�����</a></li>
							<li><a href="/help/hm2e/pay20.jsp">�����ҵ� ��������</a></li>
							<li><a href="/help/hm2e/pay12.jsp">�λ�޿� ��й�ȣ</a></li>
                            <li><a href="/help/hm2e/pay11.jsp">�λ�޿� ȯ�漳��</a></li>
                        </ol>
                    <li><a href="/help/hm2e/argus01.jsp">�����ڻ�</a></li>
                    <li><a href="/help/hm2e/other03.jsp">����</a></li>
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