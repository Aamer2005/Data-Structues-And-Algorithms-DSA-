import React from 'react';

const Footer = () => {
    const currentYear = new Date().getFullYear();

    return (
        <footer className="bg-gray-900 text-white py-12">
            <div className="container mx-auto px-6">
                <div className="grid md:grid-cols-3 gap-8 mb-8">
                    <div>
                        <h3 className="text-2xl font-bold mb-4">Joe.</h3>
                        <p className="text-gray-400">
                            Creating beautiful and functional web experiences that make a difference.
                        </p>
                    </div>

                    <div>
                        <h3 className="text-lg font-semibold mb-4">Quick Links</h3>
                        <ul className="space-y-2">
                            {['home', 'about', 'portfolio', 'blog', 'contact'].map((item) => (
                                <li key={item}>
                                    <button
                                        onClick={() => {
                                            const element = document.getElementById(item);
                                            if (element) {
                                                element.scrollIntoView({ behavior: 'smooth' });
                                            }
                                        }}
                                        className="text-gray-400 hover:text-white transition-colors capitalize"
                                    >
                                        {item}
                                    </button>
                                </li>
                            ))}
                        </ul>
                    </div>

                    <div>
                        <h3 className="text-lg font-semibold mb-4">Connect With Me</h3>
                        <div className="flex space-x-4">
                            {['github', 'linkedin', 'twitter'].map((social) => (
                                <a
                                    key={social}
                                    href="#"
                                    className="w-10 h-10 bg-gray-800 rounded-full flex items-center justify-center hover:bg-blue-600 transition-colors"
                                >
                                    <span className="capitalize">{social[0]}</span>
                                </a>
                            ))}
                        </div>
                    </div>
                </div>

                <div className="border-t border-gray-800 pt-8 text-center">
                    <p className="text-gray-400">
                        &copy; {currentYear} Joe Greyson. All rights reserved.
                    </p>
                </div>
            </div>
        </footer>
    );
};

export default Footer;