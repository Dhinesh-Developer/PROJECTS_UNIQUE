function Project(){
    const project = [
        {
         title : "Project one",
         description : "A web application built using the react",
         link  : "#"
        },
        {
         title : "Project two",
         description : "A e-commerce project",
         link : "#"
        },
        {
         title : "Project three",
         description : "A  AI project",
         link  : "#"
        }
       ]
     
    return(
        <section id='projects' className='projects-section'>
        <h2>Projects</h2>
        <div className='projects-lists'>
        {project.map((project, index) => (
          <div key={index} className='project-item'>
            <h3>{project.title}</h3>
            <p>{project.description}</p>
          </div>
        ))}
        </div>
      </section>

    );
}

export default Project;