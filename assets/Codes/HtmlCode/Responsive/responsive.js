const Anim = () => {

    let data = document.querySelector(".text p").textContent.split(" ");

    let clutter = "";

    data.forEach(span => {
        clutter += `<span>${span} </span>`
    })

    document.querySelector(".text p").innerHTML = clutter;

    let tl = gsap.timeline();

    tl.to("img" ,{
        left: 0,
        duration: 2,
        stagger: 0.5,
        ease: "Power4.easeInOut",
    })

    tl.from("nav" , {
        top : "-70px",
        duration: 1 
    })

    tl.from(".text h1" , {
        opacity: 0,
        duration: 1.2
    })

    tl.from("p span" , {
        top: "100vh",    
        stagger: 0.2,
        duration: 1.1,
        ease: "PowerInOut"
    })

    tl.from(".read a" , {
        left: "-100%",    
        duration: 1.2,
        ease: "PowerInOut"
    } , "Read")

    tl.from(".read" , {
        scale: 0.2,    
        duration: 1,
        ease: "PowerInOut"
    } , "Read")

    tl.from(".upper .upper-left h1" , {
        top: "100%",    
        duration: 1.2,
        ease: "PowerInOut"
    })


}

Anim();