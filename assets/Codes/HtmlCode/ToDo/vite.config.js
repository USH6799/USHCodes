import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vitejs.dev/config/
export default defineConfig({
  base: "/USHCodes/assets/Codes/HtmlCode/ToDo",
  plugins: [react()],
})
