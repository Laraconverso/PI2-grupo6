import FixtureContainer from "@/components/fixture/FixtureContainer";
import TeamContainer from "@/components/teams/TeamContainer";
import Image from "next/image";
import footballBanner from "@public/bannerFootball.png"

export default function Home() {
  
  return (
    <main className="flex flex-col bg-gradient-to-b bg-primary-400 min-h-screen">
      <figure className="w-full">
          <Image src={footballBanner} className="object-cover" alt={"Football banner"}/>
        </figure>
      <div className={`mt-14`}>
        <h1 className="text-center text-5xl font-bauhs"> Bienvenido DT</h1>
      </div>
      <div className={`flex flex-col lg:flex-row justify-evenly shadow-2xl my-6 px-2 gap-5`}>
        <FixtureContainer />
        <TeamContainer />
      </div>
    </main>
  );
}
