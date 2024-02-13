import FixtureContainer from "@/components/fixture/FixtureContainer";
import TeamContainer from "@/components/teams/TeamContainer";

export default function Home() {
  return (
    <main className="flex flex-col bg-gradient-to-b  from-primary-600 to-primary-400 min-h-screen">
      <div className={`mt-40`}>
      <h1 className="text-center text-5xl font-bauhs"> Bienvenido a ClubAPP</h1>
      </div>
      <div className={`flex justify-evenly shadow-2xl mx-16 mt-16 pb-6 px-6`}>
        <FixtureContainer/>
        <TeamContainer/>
      </div>
    </main>
  );
}
