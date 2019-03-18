<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./_adminHead.jsp" %>
<article>
  <section>
    <h3>주문현황</h3>
  </section>

  <section>
    <h3>공지사항</h3>
  </section>

  <section>
    <h3>최신상품</h3>
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
      </tbody>
    </table>
  </section>

  <section>
    <h3>회원현황</h3>
  </section>
</article>
<%@ include file="./_adminTail.jsp" %>
