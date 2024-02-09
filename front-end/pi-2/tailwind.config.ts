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
        }
      }
    },
  },
  plugins: [],
};
export default config;
