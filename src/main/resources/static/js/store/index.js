//获取url中的参数  为搜索框设置搜索值
var searchkey = document.getElementById("search").value;
// var searchkey = $(".searchkey").val();
$(".book_order a").click(function (e) {
    var order = $(this).text();
    var price = $(".price_area .active a").text();
    var type = $(".book_type .active a").attr("value");
    window.location.href = "/search?category=" + type + "&price=" + price + "&order=" + order + "&searchkey=" + searchkey;
})
$(".price_area a").click(function (e) {
    var order = $(".book_order .active a").text();
    var price = $(this).text();
    var type = $(".book_type .active a").attr("value");
    window.location.href = "/search?category=" + type + "&price=" + price + "&order=" + order + "&searchkey=" + searchkey;

})
$(".book_type a").click(function (e) {
    var order = $(".book_order .active a").text();
    var price = $(".price_area .active a").text();
    var type = $(this).attr("value");
    window.location.href = "/search?category=" + type + "&price=" + price + "&order=" + order + "&searchkey=" + searchkey;
})
$("#search_btn").click(function (e) {
    var searchkey = $(".searchkey").val();
    window.location.href = "/search?searchkey=" + searchkey;
})
$(".pagination li a").click(function (e) {
    var order = $(".book_order .active a").text();
    var price = $(".price_area .active a").text();
    var type = $(".book_type .active a").attr("value");
    var searchkey = $(".searchkey").val();
    var page = $(this).attr("value");
    window.location.href = "/search?category=" + type + "&price=" + price + "&order=" + order + "&searchkey=" + searchkey + "&page=" + page;
})
