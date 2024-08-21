// let img = document.querySelectorAll(".image img");

const Anim = () => {
    gsap.to(".image" , {
        width: "100%",
        ease: "Expo.easeInOut",
        duration: 2,
        stagger: 2
    })
    
    gsap.to(".image" , {
        delay: 4,
        width: "0%",
        ease: "Expo.easeInOut",
        duration: 2,
        stagger: 2
    })
    
    gsap.to(".text h1" , {
        top : 0,
        ease: "Expo.easeInOut",
        duration: 2,
        stagger: 2,
        opacity: 1
    })
    
    gsap.to(".text h1" , {
        opacity: 0,
        delay: 2,
        top : 180,
        ease: "Expo.easeInOut",
        duration: 2,
        stagger: 2
    })

    .then(() => {
        Anim()
    })
}

Anim()
