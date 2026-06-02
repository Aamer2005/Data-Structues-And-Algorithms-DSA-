import React from 'react';

const About = () => {
    return (
        <section id="about" className="py-20 bg-gray-50">
            <div className="container mx-auto px-6">
                <div className="text-center mb-12">
                    <h2 className="text-4xl font-bold text-gray-800 mb-4">About Me</h2>
                    <div className="w-20 h-1 bg-blue-600 mx-auto"></div>
                </div>

                <div className="max-w-3xl mx-auto text-center">
                    <p className="text-gray-600 text-lg leading-relaxed mb-6">
                        I'm a passionate Frontend Developer with expertise in building modern,
                        responsive, and user-friendly web applications. With several years of
                        experience in the industry, I've worked with various technologies including
                        React, Vue.js, and Tailwind CSS.
                    </p>
                    <p className="text-gray-600 text-lg leading-relaxed">
                        I believe in writing clean, maintainable code and creating seamless user
                        experiences. When I'm not coding, you can find me exploring new technologies,
                        contributing to open source, or sharing knowledge through my blog.
                    </p>
                </div>

                {/* Skills */}
                <div className="mt-12">
                    <h3 className="text-2xl font-semibold text-center text-gray-800 mb-8">
                        My Skills
                    </h3>
                    <div className="grid grid-cols-2 md:grid-cols-4 gap-6 max-w-4xl mx-auto">
                        {['React', 'JavaScript', 'Tailwind CSS', 'Node.js', 'Vue.js', 'TypeScript', 'HTML/CSS', 'Git'].map((skill) => (
                            <div key={skill} className="bg-white p-4 rounded-lg shadow-md text-center hover:shadow-lg transition-shadow">
                                <p className="font-semibold text-gray-700">{skill}</p>
                            </div>
                        ))}
                    </div>
                </div>
            </div>
        </section>
    );
};

export default About;