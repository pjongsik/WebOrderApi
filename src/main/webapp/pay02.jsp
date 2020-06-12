<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="EUC-KR" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>얼마에요 도움말</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel=stylesheet type="text/css" href="/help/hm2e/css/css.css">
</head>

<body>
<table cellpadding="0" cellspacing="0" border="0" width="100%">
    <tr>
        <td class="Left">
            <!-- 카테고리 -->
			<%@ include file="inc/left_10.jsp" %>
            <!-- //카테고리 -->
        </td>
        <td class="cont">
			<div class="tit">사원추가, 부서관리</div>
			<div class="view">
				<table width="100%" border="0" cellspacing="5px" cellpadding="0">
					<tr>
						<td class="f_exp">사원을 추가할 때는 좌측 해당 부서를 먼저 클릭하여 선택한 뒤, 오른쪽의 사원리스트화면에서 마우스 오른쪽을 클릭하여 [추가]를 선택합니다.</td>
					</tr>
					<tr>
						<td>
							<p class="padding1"><img src="/help/hm2e/img/i_2img1.gif" /></p>
						</td>
					</tr>
					<tr>
						<td class="stit">● 기본사항 </td>
					</tr>
					<tr>
						<td>
						화면의 좌측에는 성함, 주소, 연락처등 사원 개인에 대한 기본적인 내용들을 입력합니다.
						<p class="f_b_point">[사원번호]</p>
						사원번호는 101번 부터 시작해서 차례로 자동으로 부여됩니다.<br />
						필요에 따라 사원번호는 수정하여 저장할 수 있습니다.
						<p class="f_b_point">[사원구분]</p>
						정규직, 임시직중 선택합니다. &lt;정규직&gt;을 선택하면 우측 [급여관련] 탭 하단의 [임시직정보]의 급여지급방법을 사용할 수 없습니다.
						<p class="f_b_point">[직위]</p>
						직위를 선택합니다. 직위의 설정은 [인사급여 환경설정]의 [부서/직책]탭에서 수정할 수 있습니다.
						<p class="f_b_point">[부서]</p>
						소속 부서를 선택합니다. 부서항목의 추가는 [부서] 돋보기를 클릭하여 부서리스트를 부른 뒤 마우스 오른쪽을 사용하거나 또는 사원관리대장 좌측 중앙의 트리에서 마우스 오른쪽 메뉴를 이용합니다.
						<p class="f_b_point">[사원사진]</p>
						사원별 사진 그림파일이 저장되어 있으면, 해당 파일을 찾아 선택하여 저장하면 사진이 나타납니다.
						<p class="f_b_point">[입사일~채용구분]</p>
						사원별 입사정보를 입력, 선택합니다.</p>
						<p class="f_b_point">[중간정산]</p>
						[퇴직소득 관리대장]에서 사원 선택시 자동으로 입력됩니다.
						<p class="f_b_point">[퇴사처리완료]</p>
						퇴사자는 퇴사일을 입력하고 퇴사처리 완료에 체크합니다.
						<p class="f_b_point">[주민등록번호~비고]</p>
						사원등록을 위해서는 반드시 주민등록번호는 기재해야 하며, 주소를 비롯해 사원의 정보를 입력합니다.
						</td>
					</tr>
					<tr>
						<td class="stit">● 급여관련 </td>
					</tr>
					<tr>
						<td>
						<p class="f_b_point">[건강보험번호]</p>
						건강보험 번호를 입력합니다. 재발급시 필요할 경우를 대비한 것으로, 실제 급여계산과는 관계가 없습니다.
						<p class="f_b_point">[국민연금/건강보험/고용보험신고금액]</p>
						필요한 경우 국민연금관리공단과 건강보험관리공단에 신고한 표준보수월액을 입력합니다.<br />
						급여관리대장에서 급여 입력할 때 연금/보험료 계산이 해당 월급여지급액에 따라 계산되지 않고 각각의 신고금액란에 입력한 표준보수월액를 기준으로 등급별 보험료를 고정하여 입력되게 할 수 있습니다.
                                                <p class="f_b_point">[급여지급정보]</p>
						급여를 지급할 은행명, 예금주, 계좌번호를 등록합니다. [급여이체보고서]에서 지급계좌로 자동 출력됩니다.<br/>
						근로소득간이세액표에 따른 80%/100%/120% 중에서 선택 할 수 있으며, 해당내용은 연말정산시에 소급 적용됩니다. 간이세액표는 국세청에서 확인 가능합니다. http://www.nts.go.kr/cal/cal_06.asp
						</td>
					</tr>
					<tr>
						<td class="stit">● 개인이력</td>
					</tr>
					<tr>
						<td>
						<p class="f_b_point">[병역정보 ~ 학력 및 경력]</p>
						병역정보와 학력 및 경력정보 등을 입력합니다. 사원관리대장 하단의 [인쇄메뉴]-[인사기록카드 인쇄]에 자동출력 됩니다.
						</td>
					</tr>
					<tr>
						<td class="stit">● 부양가족</td>
					</tr>
					<tr>
						<td>
						[부양가족]탭에서 부양가족 명단을 입력하면 &lsquo;공제가족수&rsquo;는 다음 계산에 의해 정해집니다.
						<div class="padding2">
						<p class="notice2"><font class="f_or_point">공제가족수 = 본인1 + 배우자1 + 직계비속수 + 직계존속수</font></p>
						</div>

						즉, 공제가족숫자는 [배우자], [직계비속수], [직계존속수] 옵션의 내용만 반영되며 나머지 옵션은 연말정산시에 반영될 내용으로 일반 급여계산시의 갑근세, 주민세 계산에는 계산대상이 되지 않습니다.
						<p class="f_b_point">[학력 및 경력]</p>
						면허, 학력 등 일반적인 이력서 상의 내용을 필요한 경우 기재합니다.
						</td>
					</tr>
					<tr>
						<td class="stit">● 임시직의 급여</td>
					</tr>
					<tr>
						<td>
						[사원구분]에서 &lt;임시직&gt;을 선택하면 우측 [급여관리]탭 하단의 [임시직정보]가 활성화됩니다. 임시직의 경우에는 갑근세 등 공제가 없으므로 위의 내용을 입력하지 않고 하단의 [지급방법]과 [급여기준액]을 입력합니다.
						
						</td>
					</tr>
					<tr>
						<td class="stit">● 감면소득적용</td>
					</tr>
					<tr>
						<td>
						[조세특례제한법]및 [조세조약]에 따른 소득세감면 적용대상자인 경우 해당감면코드와 감면기간, 감면율을 입력합니다.<br />
						입력한 감면 내용에 따라 급여입력 시 소득세가 자동 계산됩니다.
						
						</td>
					</tr>
					<tr>
					  <td style="padding-top:15px">
							<p class="padding2"><strong><font class="f_re_point">※ 관련 도움말</font></strong></p>
							<p><a href="/help/hm2e/pay01.jsp"><u>사원관리</u></a>&nbsp;|&nbsp;<a href="/help/hm2e/pay05.jsp"><u>급여관리대장</u></a> 
						</td>
					</tr>
				</table>
			</div>
        </td>
    </tr>
</table>



</body>
</html>