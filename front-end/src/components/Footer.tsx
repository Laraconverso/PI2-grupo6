import tiktok from '@public/tiktok.png'
import instagram from '@public/instagram.png'
import facebook from '@public/facebook.png'
import Image from 'next/image'

const Footer = () => {
  return (
    <footer className={`bg-silver-950 p-5 flex justify-between bottom-0 w-screen`}>
      <div className={`flex gap-8`}>
        <section>2024 ClubAPP</section>
        <section className={`flex gap-8`}>
          <p className={`cursor-pointer`}>Privacidad</p>
          <p className={`cursor-pointer`}>Terminos</p>
        </section>
      </div>
      <div className={`flex gap-5`}>
        <Image src={tiktok} width="30" height="30" alt='tiktok'/>
        <Image src={instagram} width="30" height="30" alt='tiktok'/>
        <Image src={facebook} width="30" height="30" alt='tiktok'/>

      </div>
    </footer>
  )
}
export default Footer