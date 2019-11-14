<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tran
  Date: 11/14/2019
  Time: 9:00 AM
  To change this template use File | Settings | File Templates.
--%>
<div id="container">
    <div id="prod_wrapper">
        <div>
            <%--@elvariable id="newProducts" type="java.util.List"--%>
            <c:forEach var="product" items="${newProducts}">
            <div class="row border-bottom d-flex justify-content-center mb-3">
                <div class="col-5" style="text-align: center; position: relative">
                    <img class="mx-auto border" style="display: inline-block" src="${initParam.imgProductPath}${product.getImage()}" alt="" width="300px" />
                </div>

                <div class="col-7">
                    <h5>${product.getName()}</h5>
                    <p>${product.getDescription()}</p>
                    <p style="text-align: left">
                        <a href="#" class="button">More Info</a>
                        <a href="#" class="button">Buy now</a>
                    </p>
                </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>
