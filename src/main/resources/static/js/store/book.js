function check() {
    var number = document.getElementById("buy_number").value;
    var regular = /^[0-9]*[1-9][0-9]*$/     //正整数
    if (!regular.test(number)) {
        document.getElementById("buy_number").value = 1;
        return false;
    } else return true;
}

function purchase(book) {
    var number = document.getElementById("buy_number").value;
    window.location.href = "/purchase/" + number;
}