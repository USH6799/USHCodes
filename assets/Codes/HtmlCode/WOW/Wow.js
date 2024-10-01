const GrayOut = () => {
    gsap.to(circle , {
        opacity: 0.3,
        duration: 0.5,
        scale: 1,
    })

    gsap.to(elem , {
        opacity: 0.5,
        scale: 0.7,
        ease : Expo.easeInOut,
        duration: 1,
        delay: 0.2,
        padding: "0px 0px 0px 30px"
    })
}

let circle = document.querySelectorAll(".panel-circle");

gsap.to(".circle" , {
    rotate: 0,
    ease: Expo.easeInOut,
    duration: 2,
})

let elem = document.querySelectorAll(".second");

let active = 2;


gsap.to(elem[active] , {
    opacity: 1,
    scale: 1.2,
    ease : Expo.easeInOut,
    duration: 1,
    delay: 1,
    padding: "0px 0px 0px 100px"
})


gsap.to(circle[active] , {
    opacity: 0.7,
    duration: 0.5,
    scale: 1.2
})

circle.forEach((item , index) => {
    item.addEventListener("click" , () => {
        gsap.to(".circle" , {
            rotate: (10 * (3 - (index + 1))),
            duration: 1,
            ease: Expo.easeInOut
        })
        GrayOut();
        
        gsap.to(item , {
            opacity: 0.7,
            duration: 0.5,
            scale: 1.2
        })

        gsap.to(elem[index] , {
                opacity: 1,
                scale: 1.2,
                ease : Expo.easeInOut,
                duration: 1,
                delay: 0.2,
                padding: "0px 0px 0px 100px"
        })


    })
})
