import React from 'react';

const Hero = () => {
    const scrollToContact = () => {
        const contactSection = document.getElementById('contact');
        if (contactSection) {
            contactSection.scrollIntoView({ behavior: 'smooth' });
        }
    };

    const scrollToPortfolio = () => {
        const portfolioSection = document.getElementById('portfolio');
        if (portfolioSection) {
            portfolioSection.scrollIntoView({ behavior: 'smooth' });
        }
    };

    return (
        <section id="home" className="min-h-screen flex items-center pt-20">
            <div className="container mx-auto px-6 py-20">
                <div className="grid md:grid-cols-2 gap-12 items-center">
                    {/* Left Content */}
                    <div className="space-y-6">
                        <div className="space-y-2">
                            <p className="text-blue-600 font-semibold text-lg">Let's Talk</p>
                            <h1 className="text-5xl md:text-6xl font-bold text-gray-800">
                                Hi, I'm Joe Greyson
                            </h1>
                            <h2 className="text-3xl md:text-4xl text-gray-600">
                                Frontend Developer
                            </h2>
                        </div>

                        <p className="text-gray-600 text-lg leading-relaxed">
                            Lorem ipsum dolor sit amet consectetur adipisicing elit.
                            Inventore et officiis suscipit ut assumenda libero tenetur
                            expedita eaque, quaerat quasi.
                        </p>

                        <div className="flex gap-4">
                            <button
                                onClick={scrollToContact}
                                className="px-8 py-3 bg-blue-600 text-white rounded-lg font-semibold hover:bg-blue-700 transition-all transform hover:scale-105 shadow-lg"
                            >
                                Hire Me
                            </button>
                            <button
                                onClick={scrollToPortfolio}
                                className="px-8 py-3 border-2 border-blue-600 text-blue-600 rounded-lg font-semibold hover:bg-blue-50 transition-all transform hover:scale-105"
                            >
                                See Projects
                            </button>
                        </div>
                    </div>

                    {/* Right Content - Avatar/Image */}
                    <div className="flex justify-center">
                        <div className="relative">
                            <div className="w-72 h-72 md:w-96 md:h-96 bg-gradient-to-br from-blue-400 to-blue-600 rounded-full flex items-center justify-center shadow-2xl">
                                <div className="w-64 h-64 md:w-80 md:h-80 bg-white rounded-full flex items-center justify-center">
                                    <svg className="w-40 h-40 md:w-56 md:h-56 text-gray-400" fill="currentColor" viewBox="0 0 24 24">
                                        <path d="M12 12c2.21 0 4-1.79 4-4s-1.79-4-4-4-4 1.79-4 4 1.79 4 4 4zm0 2c-2.67 0-8 1.34-8 4v2h16v-2c0-2.66-5.33-4-8-4z" />
                                    </svg>
                                </div>
                            </div>
                            <div className="absolute top-0 right-0 w-24 h-24 bg-yellow-400 rounded-full -z-10 animate-pulse"></div>
                            <div className="absolute bottom-0 left-0 w-32 h-32 bg-pink-400 rounded-full -z-10 animate-bounce"></div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    );
};

export default Hero;