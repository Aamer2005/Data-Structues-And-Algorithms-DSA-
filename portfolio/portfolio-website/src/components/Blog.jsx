import React from 'react';

const Blog = () => {
    const blogPosts = [
        {
            id: 1,
            title: "Getting Started with React Hooks",
            date: "March 15, 2024",
            excerpt: "Learn how to use React Hooks to manage state and side effects in functional components.",
            image: "https://via.placeholder.com/400x250/61DAFB/FFFFFF?text=React+Hooks"
        },
        {
            id: 2,
            title: "Mastering Tailwind CSS",
            date: "March 10, 2024",
            excerpt: "Tips and tricks for building beautiful responsive designs with Tailwind CSS.",
            image: "https://via.placeholder.com/400x250/38BDF8/FFFFFF?text=Tailwind+CSS"
        },
        {
            id: 3,
            title: "Modern Web Development Trends 2024",
            date: "March 5, 2024",
            excerpt: "Explore the latest trends and technologies shaping the future of web development.",
            image: "https://via.placeholder.com/400x250/10B981/FFFFFF?text=Web+Trends"
        }
    ];

    return (
        <section id="blog" className="py-20 bg-gray-50">
            <div className="container mx-auto px-6">
                <div className="text-center mb-12">
                    <h2 className="text-4xl font-bold text-gray-800 mb-4">Latest Blog Posts</h2>
                    <div className="w-20 h-1 bg-blue-600 mx-auto mb-8"></div>
                    <p className="text-gray-600 max-w-2xl mx-auto">
                        Sharing my thoughts and experiences about web development and technology
                    </p>
                </div>

                <div className="grid md:grid-cols-2 lg:grid-cols-3 gap-8">
                    {blogPosts.map((post) => (
                        <div key={post.id} className="bg-white rounded-lg overflow-hidden shadow-lg hover:shadow-xl transition-shadow">
                            <img src={post.image} alt={post.title} className="w-full h-48 object-cover" />
                            <div className="p-6">
                                <p className="text-sm text-blue-600 mb-2">{post.date}</p>
                                <h3 className="text-xl font-bold text-gray-800 mb-3">{post.title}</h3>
                                <p className="text-gray-600 mb-4">{post.excerpt}</p>
                                <button className="text-blue-600 font-semibold hover:text-blue-700 transition-colors">
                                    Read More →
                                </button>
                            </div>
                        </div>
                    ))}
                </div>

                <div className="text-center mt-12">
                    <button className="px-8 py-3 bg-blue-600 text-white rounded-lg font-semibold hover:bg-blue-700 transition-all">
                        View All Posts
                    </button>
                </div>
            </div>
        </section>
    );
};

export default Blog;