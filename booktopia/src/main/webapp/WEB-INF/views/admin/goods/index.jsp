<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_adminHead.jsp" %>
<article>
  <h3>상품관리</h3>
  <form method="post">
    <table cellpadding="10" cellspacing="10">
      <tbody>
        <tr>
          <td>
            <input type="radio" name="r_search" checked="">등록일로 조회 &nbsp;&nbsp;&nbsp;
            <input type="radio" name="r_search">상세조회 &nbsp;&nbsp;&nbsp;
          </td>
        </tr>
        <tr>
          <td>
            <select name="curYear">
              <option value="2019" selected="">2019</option>
              <option value="2018">2018</option>
              <option value="2017">2017</option>
              <option value="2016">2016</option>
              <option value="2015">2015</option>
              <option value="2014">2014</option>
            </select>년 <select name="curMonth">
              <option value="1">1</option>
              <option value="2">2</option>
              <option value="3" selected="">3</option>
              <option value="4">4</option>
              <option value="5">5</option>
            </select>월
            <select name="curDay">
              <option value="1">1</option>
              <option value="2">2</option>
              <option value="31">31</option>
            </select>일 &nbsp;이전&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="#"><img src="/booktopia/img/btn_search_one_day.jpg"></a>
            <a href="#"><img src="/booktopia/img/btn_search_1_week.jpg"></a>
            <a href="#"><img src="/booktopia/img/btn_search_2_week.jpg"></a>
            <a href="#"><img src="/booktopia/img/btn_search_1_month.jpg"></a>
            <a href="#"><img src="/booktopia/img/btn_search_2_month.jpg"></a>
            <a href="#"><img src="/booktopia/img/btn_search_3_month.jpg"></a>
            <a href="#"><img src="/booktopia/img/btn_search_4_month.jpg"></a>
            &nbsp;까지 조회
          </td>
        </tr>
        <tr>
          <td>
            <select name="search_condition" disabled="">
              <option value="전체" checked="">전체</option>
              <option value="제품번호">상품번호</option>
              <option value="제품이름">상품이름</option>
              <option value="제조사">제조사</option>
            </select>
            <input type="text" size="30" disabled="">
            <input type="button" value="조회" disabled="">
          </td>
        </tr>
        <tr>
          <td>
            조회한 기간:<input type="text" size="4" value="2018">년
            <input type="text" size="4" value="11">월
            <input type="text" size="4" value="13">일
            &nbsp; ~
            <input type="text" size="4" value="2019">년
            <input type="text" size="4" value="03">월
            <input type="text" size="4" value="13">일
          </td>
        </tr>
      </tbody>
    </table>
    <div class="clear">
    </div>
  </form>
  <div class="clear"></div>
  <table class="list_view">
    <tbody align="center">
      <tr style="background:#33ff00">
        <td>상품번호</td>
        <td>상품이름</td>
        <td>저자</td>
        <td>출판사</td>
        <td>상품가격</td>
        <td>입고일자</td>
        <td>출판일</td>
      </tr>
      <tr>
        <td colspan="8" class="fixed">
          <strong>조회된 상품이 없습니다.</strong>
        </td>
      </tr>
      <tr>
        <td colspan="8" class="fixed">
          <a href="#">1</a>
          <a href="#">2</a>
          <a href="#">3</a>
          <a href="#">4 </a>
          <a href="#">5 </a>
          <a href="#">6 </a>
          <a href="#">7 </a>
          <a href="#">8 </a>
          <a href="#">9 </a>
          <a href="#">10 </a>
          <a href="#">&nbsp; next</a>
        </td>
      </tr>
    </tbody>

  </table>
  <div class="clear"></div>
  <br><br><br>
  <h3>상품등록하기</h3>
  <div id="search">
    <form action="#">
      <input type="submit" value="상품 등록하기">
    </form>
  </div>
</article>
<%@ include file="../_adminTail.jsp" %>
