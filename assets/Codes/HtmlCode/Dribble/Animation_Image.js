let clutter = "";

document.querySelector(".text p").split(" ").forEach(span => {
    clutter += "<span>" + span + "</span>";
});

document.querySelector(".text  p").innerHTML = clutter;

gsap.to()