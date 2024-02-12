import type { Config } from "tailwindcss";

const config: Config = {
  content: [
    "./src/pages/**/*.{js,ts,jsx,tsx,mdx}",
    "./src/components/**/*.{js,ts,jsx,tsx,mdx}",
    "./src/app/**/*.{js,ts,jsx,tsx,mdx}",
  ],
  theme: {
    extend: {
      colors: {
        'primary': {
          '50': '#fef5ee',
          '100': '#fde9d7',
          '200': '#facfae',
          '300': '#f7ac7a',
          '400': '#f28045',
          '500': '#ee5a1b',
          '600': '#e04516',
          '700': '#ba3314',
          '800': '#942918',
          '900': '#772417',
          '950': '#40100a',
        },
        'silver': {
          '50': '#f7f7f7',
          '100': '#ededed',
          '200': '#dfdfdf',
          '300': '#c8c8c8',
          '400': '#b0b0b0',
          '500': '#999999',
          '600': '#888888',
          '700': '#7b7b7b',
          '800': '#676767',
          '900': '#545454',
          '950': '#363636',
        },

      },
      fontFamily: {
        bauhs: ['bauhs93', 'sans']
      },
dropShadow: {
  md: '0 4px 3px rgba(0, 0, 0, 0.3)'
}
    },
  },
  plugins: [],
};
export default config;
