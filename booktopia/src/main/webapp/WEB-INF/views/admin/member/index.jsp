<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_adminHead.jsp" %>
<article>
  <H3>회원관리</H3>
  <form name="frm_delivery_list">
    <table cellpadding="10" cellspacing="10">
      <tbody>
        <tr>
          <td>
            <input type="radio" name="r_search_option" value="simple_search" checked /> 간단조회 &nbsp;&nbsp;&nbsp;
            <input type="radio" name="r_search_option" value="detail_search" /> 상세조회 &nbsp;&nbsp;&nbsp;
          </td>
        </tr>
        <tr>
          <td>
            <select name="curYear">
              <option value="2019" selected>2019</option>
            </select>년
            <select name="curMonth">
              <option value="1" selected>1</option>
            </select>월

            <select name="curDay">
              <option value="12" selected>12</option>
            </select>일 &nbsp;이전&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="#"><img src="/booktopia/img/btn_search_one_day.jpg"></a>
            <a href="#"><img src="/booktopia/img/btn_search_1_week.jpg"></a>
            <a href="#"><img src="/booktopia/img/btn_search_2_week.jpg"></a>
            <a href="#"><img src="/booktopia/img/btn_search_1_month.jpg"></a>
            <a href="#"><img src="/booktopia/img/btn_search_2_month.jpg"></a>
            <a href="#"><img src="/booktopia/img/btn_search_3_month.jpg"></a>
            <a href="#"><img src="/booktopia/img/btn_search_4_month.jpg"></a>&nbsp;까지 조회
          </td>
        </tr>

        <tr>
          <td>
            조회 기간:
            <select name="beginYear" disabled>
              <option value="2019" selected>2019</option>
            </select>년
            <select name="beginMonth" disabled>
              <option value="3" selected>3</option>
            </select>월
            <select name="beginDay" disabled>
              <option value="2" selected>2</option>
            </select>일 &nbsp; ~

            <select name="endYear" disabled>
              <option value="2019" selected>2019</option>
            </select>년
            <select name="endMonth" disabled>
              <option value="4" selected>4</option>
            </select>월
            <select name="endDay" disabled>
              <option value="7" selected>7</option>
            </select>

          </td>
        </tr>
        <tr>
          <td>
            <select name="s_search_type" disabled>
              <option value="all" checked>전체</option>
              <option value="member_name">회원이름</option>
              <option value="member_id">회원아이디</option>
              <option value="member_hp_num">회원휴대폰번호</option>
              <option value="member_addr">회원주소</option>
            </select>
            <input type="text" size="30" name="t_search_word" disabled />
            <input type="button" value="조회" name="btn_search" disabled />
          </td>
        </tr>
      </tbody>
    </table>
    <div class="clear">
    </div>

    <div class="clear"></div>
    <table class="list_view">
      <tbody align=center>
        <tr align=center bgcolor="#ffcc00">
          <td class="fixed">회원아이디</td>
          <td class="fixed">회원이름</td>
          <td>휴대폰번호</td>
          <td>주소</td>
          <td>가입일</td>
          <td>탈퇴여부</td>
        </tr>
        <tr>
          <td width=10%>

            <a href="#">
              <strong>hongkildong</strong>
            </a>
          </td>
          <td width=10%>
            <strong>홍길동</strong><br>
          </td>
          <td width=10%>
            <strong>010-1234-1234</strong><br>
          </td>
          <td width=50%>
            <strong>부산 남구 대연동 1234</strong><br>
            <strong>8층 801호</strong><br>
          </td>
          <td width=10%>
            <strong>2019/03/12</strong>
          </td>
          <td width=10%>
            <strong>활동중</strong>
            <strong>탈퇴</strong>
          </td>
        </tr>
        <tr>
          <td colspan=8 class="fixed">
            <a href="#">&nbsp;이전&nbsp;</a>
            <a href="#">1</a>
            <a href="#">&nbsp;다음</a>
          </td>
        </tr>
      </tbody>
    </table>
  </form>
  <div class="clear"></div>
  <DIV id="page_wrap">
    <a href="#">&nbsp;이전 &nbsp;</a>
    <a href="#">1</a>
    <a href="#">&nbsp; 다음</a>
  </DIV>
</article>
<%@ include file="../_adminTail.jsp" %>
