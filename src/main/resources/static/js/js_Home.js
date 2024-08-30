let list = document.querySelector(".slider .list");
let items = document.querySelectorAll(".slider .list .item");
let dots = document.querySelectorAll(".slider .dots li");
let prev = document.getElementById("prev");
let next = document.getElementById("next");

let index = 0;
let lengthItems = items.length - 1;
// length sẽ đếm từ 1 - 2 - 3 còn vị trí thì nó sẽ tính từ 0 - 1 - 2 - 3
console.log(lengthItems);

// Function to handle next slide
function nextSlide() {
  if (index + 1 > lengthItems) {
    index = 0;
  } else {
    index += 1;
  }
  reloadSlider();
}

// Function to handle previous slide
function prevSlide() {
  if (index - 1 < 0) {
    index = lengthItems;
  } else {
    index -= 1;
  }
  reloadSlider();
}

next.onclick = function () {
  nextSlide();
  resetAutoSlide(); // Reset auto slide timer on manual interaction
};

prev.onclick = function () {
  prevSlide();
  resetAutoSlide(); // Reset auto slide timer on manual interaction
};

// Function to update slider position
function reloadSlider() {
  let checkLeft = items[index].offsetLeft;
  list.style.left = -checkLeft + "px";

  // xóa vị trí li cũ
  let lastActiveDot = document.querySelector(".slider .dots .active");
  // xóa class active
  lastActiveDot.classList.remove("active");
  // active cho vị trí mới
  dots[index].classList.add("active");
}

// Event listeners for dots
dots.forEach((li, key) => {
  li.addEventListener("click", function () {
    index = key;
    reloadSlider();
    resetAutoSlide(); // Reset auto slide timer on manual interaction
  });
});

// Function to reset auto slide timer
function resetAutoSlide() {
  clearInterval(autoSlide);
  autoSlide = setInterval(nextSlide, 2000);
}

// Set initial auto slide timer
let autoSlide = setInterval(nextSlide, 2000);

// Scroll
window.addEventListener("scroll", function () {
  var header = document.querySelector(".navbar");
  var scrollPosition = window.scrollY;

  if (scrollPosition > 100) {
    header.style.backgroundColor = "#fff";
    header.style.position = "fixed";
    header.style.top = "0";
    header.style.boxShadow = "5px 5px 10px rgba(0, 0, 0, 0.5)";
  } else {
    header.style.backgroundColor = "rgba(255, 255, 255,0)";
    header.style.position = "absolute";
    header.style.top = "0";
    header.style.boxShadow = "none";
  }
});

document.addEventListener("DOMContentLoaded", function () {
  //lấy ra tất cả các thẻ a
  var scrollLinks = document.querySelectorAll(".a_up");
  scrollLinks.forEach(function (link) {
    link.addEventListener("click", function (event) {
      //Tắt chế độ cuộc mặc định của thẻ a
      event.preventDefault();

      //Thiết lập chế độ cuộn lên
      window.scrollTo({
        top: 0,
        behavior: "smooth",
        // duration: 1000
      });
    });
  });
});

//Có thể sử dụng jquery
$(document).ready(function () {
  $(".a_up").click(function (event) {
    event.preventDefault();
    $("html, body").animate({ scrollTop: 0 }, 1000);
  });
});
