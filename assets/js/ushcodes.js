const Skills = () => {
	let data = [
		{
			skillname: "Web Design",
			current: "45",
		},
		{
			skillname: "Web Development",
			current: "60",
		},
		{
			skillname: "Backend (MERN)",
			current: "75",
		},
		{
			skillname: "PYTHON",
			current: "65",
		},
		{
			skillname: "Java",
			current: "45",
		},
	];

	let clutter = "";

	data.forEach((skill) => {
		clutter += `<div class="skill-name">
                        <p style="font-weight:600">${skill.skillname}</p><p style="font-weight:600">${skill.current}%</p>
                    </div>

                    <div class="progress">
                        <div class="progress-bar" role="progressbar" aria-valuenow="${skill.current}" aria-valuemin="0" aria-valuemax="100"></div>
                    </div>`;
	});

	document.querySelector(".skills").innerHTML = clutter;
};

const Timelines = () => {
	let data = [
		{
			date: "April:2024 - August:2024",
			heading: "Learning Backend In Depth",
			source: "From Youtube - Sheriyans Coding School",
			desc: "A coding school located in bhopal,M.P. (india) providing insane courses of web development, The creators and Students are One of the Best Frontend Developer in India and Also Creates Modern Website and Animations.",
		},
		{
			date: "January:2024 - June:2024",
			heading: "Learning MERN Stack Basic",
			source: "From Youtube - CodeWithHarry",
			desc: "A Coder, making useful courses videos on youtube, providing teaching to others, #3 in indian best Coding community Youtuber.",
		},
		{
			date: "November:2023 - April:2024",
			heading: "Learned UI/UX Designing",
			source: "From Youtube - AnshMehra & Figma.com",
			desc: "A UI/UX Designer giving absolute free Course of UI designing and Other important Designing Tips, also looking for job opportunities",
		},
		{
			date: "March:2023 - January:2024",
			heading: "Web Development and Java OOPs",
			source: "From Youtube - Sheriyans Coding School",
			desc: "A coding school located in bhopal,M.P. (india) providing insane courses of web development, a full course to become a front-end developer with various javascript , react js, angular js, and also responsiveness.",
		},
		{
			date: "January:2022 - June:2024",
			heading: "Python/Java Basics",
			source: "From Youtube - Apna College",
			desc: "Best for beginner level stuffs and understandable Courses, also sells offline courses and different teaching.",
		},
		{
			date: "2022 - 2023",
			heading: "Worked As a Freelancer",
			source: "At freelancer.com",
			desc: "Completely fulfilled 2 projects of AI enhancement and Backend LG Gaming techs.",
		},
	];

	let clutter = "";

	let flag = true;

	data.forEach((timeline) => {
		slide = flag ? "left slideInRight" : "right slideInLeft";
		flag = !flag;

		clutter += `
            <div class="timeline-item ${slide.split(" ")[0]} wow ${slide.split(" ")[1]}" data-wow-delay="0.1s">
                <div class="timeline-text">
                    <div class="timeline-date">${timeline.date}</div>
                    <h2>${timeline.heading}</h2>
                    <h4 style="font-weight: 600">${timeline.source}</h4>
                    <p>
                        ${timeline.desc}
                    </p>
                </div>
            </div>
        `;
	});

	document.querySelector(".timeline").innerHTML = clutter;
};

const Blogs = () => {
	let data = [
		{
			heading: "A To Do Web app",
			type: "Web Design",
			date: "06-July-2024",
			comment: "2",
			img: "/assets/img/work/TodoList.webp",
			desc: "A Web Todo app capable of storing todo in internal memory also after closing it and Fully made using MERN stack and Backend Logics.",
			link: "assets/Codes/HtmlCode/ToDo/dist/index.html",
		},
		{
			heading: "A Calculator app",
			type: "Web Design",
			date: "23-July-2024",
			comment: "4",
			img: "/assets/img/work/Calculator.webp",
			desc: "A Simple Calculator Design with unique colors and theme and Also used Javascript Logics for Calculating...",
			link: "/assets/Codes/HtmlCode/Calculator/calculator.html",
		},
		{
			heading: "Animated Landing Page",
			type: "Web Animation",
			date: "03-Aug-2024",
			comment: "5",
			img: "/assets/img/work/Gsap-Landing.webp",
			desc: " A Normal Landing page but with a twist of GSAP library, GSAP is a very powerful library which let you create various animations and effects in your webpage.\nThis landing page is on of its Example and Use Case. Soon will Be Responsive.",
			link: "./assets/Codes/HtmlCode/Gsap Trial/index.html",
		},
		{
			heading: "Significo Animations",
			type: "Website Cloning",
			date: "17-Aug-2024",
			comment: "10",
			img: "/assets/img/work/Significo.webp",
			desc: "A Website Clone of Significo. Just Cloned to interact and design their animations inside it and the amazing use of Scroll Trigger and Locomotive Libraries in it. It is not Responsive till now but soon will be responsive as it uses Tailwind CSS which makes it easier to be responsive.",
			link: "./assets/Codes/HtmlCode/Significo/Significo.html",
		},
	];

	let clutter = "";


	data.forEach((blog) => {

		clutter += `
        <div class="col-lg-6">

			<div class="blog-item wow fadeInUp" data-wow-delay="0.2s">

				<div class="blog-img">
					<img src="${blog.img}" alt="Blog" />
				</div>

				<div class="blog-text">
					<h2>${blog.heading}</h2>
					<div class="blog-meta">
						<p><i class="far fa-user"></i>Admin</p>
						<p><i class="far fa-list-alt"></i>${blog.type}</p>
						<p><i class="far fa-calendar-alt"></i>${blog.date}</p>
						<p><i class="far fa-comments"></i>${blog.comment}</p>
					</div>
					<p>
						${blog.desc}
					</p>
					<a
						class="btn"
						href="${blog.link}"
						target="_blank"
						>Preview <i class="fa fa-angle-right"></i
					></a>
				</div>
			</div>
		</div>

        `;
	});

	document.querySelector(".blog-container").innerHTML = clutter;
};



Skills();
Timelines();
Blogs();
