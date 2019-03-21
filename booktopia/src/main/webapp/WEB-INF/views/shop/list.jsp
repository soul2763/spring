<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ include file="../_head.jsp" %>
<article>
	<title>도서 목록 페이지</title>
	<hgroup>
		<h1>컴퓨터와 인터넷</h1>
		<h2>오늘의 책</h2>
	</hgroup>
	<section id="new_book">
	<h3>새로나온 책</h3>
	<div id="left_scroll">
		<a href='javascript:slide("left");'><img src="/booktopia/img/left.gif"></a>
	</div>
	<div id="carousel_inner">
		<ul id="carousel_ul">
			<c:choose>
				<c:when test="${empty goodsList}">
					<!-- 검색 후 해당 도서가 없을때 -->
			<li>
				<div id="book"><a href="#"><h1>제품이없습니다.</h1></a></div>
			</li>
			  	</c:when>
				<c:otherwise>
					<c:forEach var="item" items="${goodsList}">
					   	<li>
					      <div id="book">
					        <a href="#"><img width="75" alt="" src="/booktopia/goods/thumbnail?goods_id=${item.GOODS_ID}&fileName=${item.FILENAME}"></a>
					        <div class="sort">[컴퓨터 인터넷]</div>
					        <div class="title">
					          <a href="#">${item.GOODS_TITLE}</a>
					      </div>
					        <div class="writer">${item.GOODS_WRITER} | ${item.GOODS_PUBLISHER}</div>
					        <div class="price">
					        	<span><fmt:formatNumber value="${item.GOODS_PRICE}" type="number" var="goods_price" />${goods_price}원</span><br>
					        	<fmt:formatNumber  value="${item.GOODS_PRICE*0.9}" type="number" var="discounted_price" />${discounted_price}원(10%할인)
					        </div>
					      </div>
					    </li>
			   		</c:forEach>
				</c:otherwise>
			</c:choose>
      	</ul>
    </div>
    <div id="right_scroll">
      <a href='javascript:slide("right");'><img src="/booktopia/img/right.gif"></a>
    </div>
    <input id="hidden_auto_slide_seconds" type="hidden" value="4000">

    <div class="clear"></div>
  </section>
  <div class="clear"></div>
  <div id="sorting">
    <ul>
      <li><a class="active" href="#">베스트 셀러</a></li>
      <li><a href="#">최신 출간</a></li>
      <li><a style="border: currentColor; border-image: none;" href="#">최근 등록</a></li>
    </ul>
  </div>
  <table id="list_view">
    <tbody>
	  <c:forEach var="item" items="${goodsList}">
	      <tr>
	        <td class="goods_image">
	          <a href="#"><img width="75" alt="" src="/booktopia/goods/thumbnail?goods_id=${item.GOODS_ID}&fileName=${item.FILENAME}"></a>
	        </td>
	        <td class="goods_description">
	          <h2><a href="#">${item.GOODS_TITLE}</a></h2>
	          <c:set var="goods_pub_date" value="${item.GOODS_PUBLISHED_DATE }" />
	          <c:set var="arr" value="${fn:split(goods_pub_date,' ')}" />
	          <div class="writer_press">${item.GOODS_WRITER}|${item.GOODS_PUBLISHER}|<c:out value="${arr[0]}"/></div>
	        </td>
	        <td class="price">
	          <span><fmt:formatNumber value="${item.GOODS_PRICE}" type="number" var="goods_price" />${goods_price}원</span><br>
	          <strong><fmt:formatNumber  value="${item.GOODS_PRICE*0.9}" type="number" var="discounted_price" />${discounted_price}원</strong><br>(10% 할인)
	        </td>
	        <td><input type="checkbox" value=""></td>
	        <td class="buy_btns">
	          <ul>
	            <li><a href="#">장바구니</a></li>
	            <li><a href="#">구매하기</a></li>
	            <li><a href="#">비교하기</a></li>
	          </ul>
	        </td>
	      </tr>
      </c:forEach>      
    </tbody>
  </table>
  <div class="clear"></div>
  <div id="page_wrap">
    <ul id="page_control">
      <li><a class="no_border" href="#">Prev</a></li>
      <li><a class="page_contrl_active" href="#">1</a></li>
      <li><a href="#">2</a></li>
      <li><a href="#">3</a></li>
      <li><a href="#">4</a></li>
      <li><a href="#">5</a></li>
      <li><a href="#">6</a></li>
      <li><a href="#">7</a></li>
      <li><a href="#">8</a></li>
      <li><a href="#">9</a></li>
      <li><a href="#">10</a></li>
      <li><a class="no_border" href="#">Next</a></li>
    </ul>
  </div>
	</section>	
</article>

<%@ include file="../_tail.jsp" %>